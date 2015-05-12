package protobuftry;

import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized;

/**
 *
 * @author tonny.staunsbrink
 */
@RunWith(Parameterized.class)
public class MessageTest {

    private final PaymentCardValidatorV1 serviceV1 = new PaymentCardValidatorV1();
    private final PaymentCardValidatorV2 serviceV2 = new PaymentCardValidatorV2();
    
    @Parameter
    public Message testData;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Payment.Card.newBuilder().setCardNumber("123456789").build() },
                {PaymentV2.Card.newBuilder().setCardNumber("1234444").setCardHolderName("Tim").build()}
        });
    }

    @Test
    public void messagesMustWorkWithAllServiceVersions() throws InvalidProtocolBufferException {
        byte[] out1 = serviceV1.preValidate(testData.toByteArray());
        assertProperties(testData, testData.newBuilderForType().mergeFrom(out1).build(), 2); //2 is a position in a protobuf
        byte[] out2 = serviceV2.preValidate(testData.toByteArray());
        assertProperties(testData, testData.newBuilderForType().mergeFrom(out1).build(), 0);
    }
    
    private void assertProperties(Message msg1, Message msg2, int ignoreField) {
        for (Descriptors.FieldDescriptor fd1 : msg1.getDescriptorForType().getFields()) {
            int fieldNumber1 = fd1.getNumber();
            Descriptors.FieldDescriptor fd2 = msg2.getDescriptorForType().findFieldByNumber(fieldNumber1);
             if(msg2.hasField(fd2) && (ignoreField != fieldNumber1)) {
                 Object v1 = msg1.getField(fd1);
                 Object v2 = msg2.getField(fd2);
                 assertEquals(v1, v2);
             }
        }   
    }    
}

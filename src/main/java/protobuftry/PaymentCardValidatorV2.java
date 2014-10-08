package protobuftry;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;

/**
 *
 */
public class PaymentCardValidatorV2 {
    
    public Message preValidate(byte[] bytes) throws InvalidProtocolBufferException {
        Object card = bytes;
        long cardNumber = card.hashCode();
        if (cardNumber % 2 == 0) {
            return null;
        } else {
            return null;
        }
    }
}

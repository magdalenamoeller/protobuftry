package protobuftry;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 *
 */
public class PaymentCardValidatorV1 {
    
    public byte[] preValidate(byte[] bytes) throws InvalidProtocolBufferException {
        Object card = bytes;
        long cardNumber = card.hashCode();
        if (cardNumber % 2 == 0) {            
            return null;
        } else {
            return null;
        }
    }

    
}

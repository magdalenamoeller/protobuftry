package protobuftry;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 *
 */
public class PaymentCardValidatorV1 {

    public byte[] preValidate(byte[] bytes) throws InvalidProtocolBufferException {
        Payment.Card card = Payment.Card.parseFrom(bytes);
        long cardHash = card.getCardNumber().hashCode();
        //Object card = bytes;
        long cardNumber = card.hashCode();
        if (cardNumber % 2 == 0) {
            return card.toBuilder()   // we use a builder in order to mutate the card's value
                    .setPreValidated(true)
                    .build()
                    .toByteArray();
        } else {
            return card.toBuilder()
                    .setPreValidated(false)
                    .build()
                    .toByteArray();
        }
    }


}

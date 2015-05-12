package protobuftry;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 *
 */
public class PaymentCardValidatorV2 {

    public byte[] preValidate(byte[] bytes) throws InvalidProtocolBufferException {
        PaymentV2.Card card = PaymentV2.Card.parseFrom(bytes);
        long cardHash = card.getCardNumber().hashCode();
        //Object card = bytes;
        long cardNumber = card.hashCode();
        if (cardNumber % 2 == 0 && card.hasCardHolderName() && card.getCardHolderName().startsWith("T")) {
            return card.toBuilder()   // we use a builder in order to mutate the card's value
                    .setPreValidated(true)
                    .build()
                    .toByteArray();
        } else {
            return card.toBuilder()   // we use a builder in order to mutate the card's value
                    .setPreValidated(false)
                    .build()
                    .toByteArray();
        }
    }
}

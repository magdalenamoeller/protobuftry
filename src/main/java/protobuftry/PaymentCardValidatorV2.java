package protobuftry;

/**
 *
 */
public class PaymentCardValidatorV2 {
    
    public Object preValidate(Object card) {
        int cardNumber = card.hashCode();
        if (cardNumber % 2 == 0) {
            // approve
            return card;
        } else {
            return card;
        }
    }
}

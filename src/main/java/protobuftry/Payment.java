// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/Payment.proto

package protobuftry;

public final class Payment {
    private Payment() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface CardOrBuilder extends
            // @@protoc_insertion_point(interface_extends:protobuftry.Card)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string cardNumber = 1;</code>
         */
        boolean hasCardNumber();
        /**
         * <code>required string cardNumber = 1;</code>
         */
        java.lang.String getCardNumber();
        /**
         * <code>required string cardNumber = 1;</code>
         */
        com.google.protobuf.ByteString
        getCardNumberBytes();

        /**
         * <code>optional bool preValidated = 2;</code>
         */
        boolean hasPreValidated();
        /**
         * <code>optional bool preValidated = 2;</code>
         */
        boolean getPreValidated();
    }
    /**
     * Protobuf type {@code protobuftry.Card}
     */
    public static final class Card extends
            com.google.protobuf.GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:protobuftry.Card)
            CardOrBuilder {
        // Use Card.newBuilder() to construct.
        private Card(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Card(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Card defaultInstance;
        public static Card getDefaultInstance() {
            return defaultInstance;
        }

        public Card getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Card(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            cardNumber_ = bs;
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            preValidated_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return protobuftry.Payment.internal_static_protobuftry_Card_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return protobuftry.Payment.internal_static_protobuftry_Card_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            protobuftry.Payment.Card.class, protobuftry.Payment.Card.Builder.class);
        }

        public static com.google.protobuf.Parser<Card> PARSER =
                new com.google.protobuf.AbstractParser<Card>() {
                    public Card parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Card(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<Card> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        public static final int CARDNUMBER_FIELD_NUMBER = 1;
        private java.lang.Object cardNumber_;
        /**
         * <code>required string cardNumber = 1;</code>
         */
        public boolean hasCardNumber() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string cardNumber = 1;</code>
         */
        public java.lang.String getCardNumber() {
            java.lang.Object ref = cardNumber_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    cardNumber_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string cardNumber = 1;</code>
         */
        public com.google.protobuf.ByteString
        getCardNumberBytes() {
            java.lang.Object ref = cardNumber_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                cardNumber_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PREVALIDATED_FIELD_NUMBER = 2;
        private boolean preValidated_;
        /**
         * <code>optional bool preValidated = 2;</code>
         */
        public boolean hasPreValidated() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional bool preValidated = 2;</code>
         */
        public boolean getPreValidated() {
            return preValidated_;
        }

        private void initFields() {
            cardNumber_ = "";
            preValidated_ = false;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasCardNumber()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getCardNumberBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBool(2, preValidated_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getCardNumberBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(2, preValidated_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static protobuftry.Payment.Card parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static protobuftry.Payment.Card parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static protobuftry.Payment.Card parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static protobuftry.Payment.Card parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static protobuftry.Payment.Card parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static protobuftry.Payment.Card parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static protobuftry.Payment.Card parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static protobuftry.Payment.Card parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static protobuftry.Payment.Card parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static protobuftry.Payment.Card parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(protobuftry.Payment.Card prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code protobuftry.Card}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:protobuftry.Card)
                protobuftry.Payment.CardOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return protobuftry.Payment.internal_static_protobuftry_Card_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return protobuftry.Payment.internal_static_protobuftry_Card_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                protobuftry.Payment.Card.class, protobuftry.Payment.Card.Builder.class);
            }

            // Construct using protobuftry.Payment.Card.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                cardNumber_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                preValidated_ = false;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return protobuftry.Payment.internal_static_protobuftry_Card_descriptor;
            }

            public protobuftry.Payment.Card getDefaultInstanceForType() {
                return protobuftry.Payment.Card.getDefaultInstance();
            }

            public protobuftry.Payment.Card build() {
                protobuftry.Payment.Card result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public protobuftry.Payment.Card buildPartial() {
                protobuftry.Payment.Card result = new protobuftry.Payment.Card(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.cardNumber_ = cardNumber_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.preValidated_ = preValidated_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof protobuftry.Payment.Card) {
                    return mergeFrom((protobuftry.Payment.Card)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(protobuftry.Payment.Card other) {
                if (other == protobuftry.Payment.Card.getDefaultInstance()) return this;
                if (other.hasCardNumber()) {
                    bitField0_ |= 0x00000001;
                    cardNumber_ = other.cardNumber_;
                    onChanged();
                }
                if (other.hasPreValidated()) {
                    setPreValidated(other.getPreValidated());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasCardNumber()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                protobuftry.Payment.Card parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (protobuftry.Payment.Card) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.lang.Object cardNumber_ = "";
            /**
             * <code>required string cardNumber = 1;</code>
             */
            public boolean hasCardNumber() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string cardNumber = 1;</code>
             */
            public java.lang.String getCardNumber() {
                java.lang.Object ref = cardNumber_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        cardNumber_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string cardNumber = 1;</code>
             */
            public com.google.protobuf.ByteString
            getCardNumberBytes() {
                java.lang.Object ref = cardNumber_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    cardNumber_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string cardNumber = 1;</code>
             */
            public Builder setCardNumber(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                cardNumber_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string cardNumber = 1;</code>
             */
            public Builder clearCardNumber() {
                bitField0_ = (bitField0_ & ~0x00000001);
                cardNumber_ = getDefaultInstance().getCardNumber();
                onChanged();
                return this;
            }
            /**
             * <code>required string cardNumber = 1;</code>
             */
            public Builder setCardNumberBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                cardNumber_ = value;
                onChanged();
                return this;
            }

            private boolean preValidated_ ;
            /**
             * <code>optional bool preValidated = 2;</code>
             */
            public boolean hasPreValidated() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional bool preValidated = 2;</code>
             */
            public boolean getPreValidated() {
                return preValidated_;
            }
            /**
             * <code>optional bool preValidated = 2;</code>
             */
            public Builder setPreValidated(boolean value) {
                bitField0_ |= 0x00000002;
                preValidated_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool preValidated = 2;</code>
             */
            public Builder clearPreValidated() {
                bitField0_ = (bitField0_ & ~0x00000002);
                preValidated_ = false;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:protobuftry.Card)
        }

        static {
            defaultInstance = new Card(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:protobuftry.Card)
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_protobuftry_Card_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_protobuftry_Card_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\027resources/Payment.proto\022\013protobuftry\"0" +
                        "\n\004Card\022\022\n\ncardNumber\030\001 \002(\t\022\024\n\014preValidat" +
                        "ed\030\002 \001(\010B\r\n\013protobuftry"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
        internal_static_protobuftry_Card_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_protobuftry_Card_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_protobuftry_Card_descriptor,
                new java.lang.String[] { "CardNumber", "PreValidated", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}

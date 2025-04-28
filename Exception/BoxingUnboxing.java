package Exception;

public class BoxingUnboxing {



	    public static void main(String[] args) {
	        // byte
	        byte primitiveByte = 10;
	        Byte nonPrimitiveByte = Byte.valueOf(primitiveByte);
	        byte primitiveByte2 = nonPrimitiveByte.byteValue();

	        // short
	        short primitiveShort = 100;
	        Short nonPrimitiveShort = Short.valueOf(primitiveShort);
	        short primitiveShort2 = nonPrimitiveShort.shortValue();

	        // integer
	        int primitiveInt = 1000;
	        Integer nonPrimitiveInt = Integer.valueOf(primitiveInt);
	        int primitiveInt2 = nonPrimitiveInt.intValue();

	        // long
	        long primitiveLong = 10000L;
	        Long nonPrimitiveLong = Long.valueOf(primitiveLong);
	        long primitiveLong2 = nonPrimitiveLong.longValue();

	        // float
	        float primitiveFloat = 12.34f;
	        Float nonPrimitiveFloat = Float.valueOf(primitiveFloat);
	        float primitiveFloat2 = nonPrimitiveFloat.floatValue();

	        // double
	        double primitiveDouble = 123.45;
	        Double nonPrimitiveDouble = Double.valueOf(primitiveDouble);
	        double primitiveDouble2 = nonPrimitiveDouble.doubleValue();

	        // boolean
	        boolean primitiveBoolean = true;
	        Boolean nonPrimitiveBoolean = Boolean.valueOf(primitiveBoolean);
	        boolean primitiveBoolean2 = nonPrimitiveBoolean.booleanValue();

	        // char
	        char primitiveChar = 'A';
	        Character nonPrimitiveChar = Character.valueOf(primitiveChar);
	        char primitiveChar2 = nonPrimitiveChar.charValue();
	    }
	}



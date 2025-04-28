package NonPrimitiveTypecasting;

public class Child extends Parent{
	@Override
	Parent create() {
		return new Child();
	}
	

}

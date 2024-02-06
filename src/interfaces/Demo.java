package interfaces;

public class Demo {
public static void main(String[] args) {
	Computer lap=new LapTop();
	Computer desk=new Desktop();
	Developer dev=new Developer();
	dev.devapp(desk);
}
}

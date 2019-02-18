public class AnyClass {
    @MyAnnotation
    public int year;

    public String name;

    @MyAnnotation
    private String field;

    private int method1(int a){
        return a;
    }

    @MyAnnotation
    public void method2(){

        System.out.println("method2");
    }
    private String method3(){
        return "method3";

    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }
}


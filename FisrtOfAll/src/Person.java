import java.math.BigInteger;

public class Person {
    private String name;
    private int age;
    private BigInteger mobileNumber;
    private boolean married;
    public Person(String name, int age, BigInteger mobileNumber,boolean married){
      this.name = name;
      this.age = age;
      this.mobileNumber = mobileNumber;
      this.married = married;
    }
    public Person(){
        name = "Ali Mahdi";
        age = 18;
        mobileNumber = new BigInteger("213667622648");
        married = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigInteger getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(BigInteger mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
    public void whoAmI() {
        System.out.printf("Hi, I'm %s, I'm %d years old, %s, here is my mobile number +%s%n",
                name, age, (married ? "married" : "not married yet"), mobileNumber);
    }

    public static void main(String[] args){
       Person p1 = new Person();
       p1.whoAmI();
       p1.setAge(19);
       p1.setMobileNumber(new BigInteger("213552466063"));
       p1.setName("Mahdi Ali");
       p1.setMarried(true);
       p1.whoAmI();
    }
}

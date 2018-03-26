interface X {
int add(int a, int b); 
}
interface Y {
int sub(int a, int b); 
}
interface Z extends X, Y {
int mul(int a, int b); 
}
class Operations implements X, Y, Z {
public int add(int a, int b) {
System.out.println("add(int, int)");
return (a + b);
}
public int sub(int a, int b) {
System.out.println("sub(int, int)");
return (a - b);
}
public int mul(int a, int b) {
System.out.println("mul(int, int)");
return (a * b);

}
}
class TestInterfaces {
public static void main(String[] args) {
Operations op = new Operations();

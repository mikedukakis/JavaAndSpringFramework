package sprint1.tasca6.n1exercici1;

public class NoGenericMethods {
    private int object1;
    private int object2;
    private int object3;

    public NoGenericMethods(int object1, int object2, int object3){
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public int getObject1() {
        return this.object1;
    }

    public void setObject1(int object1) {
        this.object1 = object1;
    }

    public int getObject2() {
        return this.object2;
    }

    public void setObject2(int object2) {
        this.object2 = object2;
    }

    public int getObject3() {
        return this.object3;
    }

    public void setObject3(int object3) {
        this.object3 = object3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                ", object3=" + object3 +
                '}';
    }
}

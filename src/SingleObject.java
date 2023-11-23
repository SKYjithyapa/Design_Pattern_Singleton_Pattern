public class SingleObject {
// In the provided code, instance is a static variable of type SingleObject,
// and it is used to implement the Singleton design pattern. The Singleton
// pattern ensures that a class has only one instance and provides a global point of
// access to that instance. Let's break down the code:


    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}

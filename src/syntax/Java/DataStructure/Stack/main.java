package syntax.Java.DataStructure.Stack;

public class main {

    public static void main(String[] args) {

//        FixedSizeStackImplementation fixedStack = new FixedSizeStackImplementation();
//        fixedStack.push(1);
//        fixedStack.push(9);
//        fixedStack.push(3);
//        fixedStack.pop();
//
//        fixedStack.print();
//        System.out.println();
//        System.out.println("peak: " + fixedStack.peek());
//
//        if (fixedStack.pop() == 3) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        DynamicStackImplementation dynamicStack = new DynamicStackImplementation();
        System.out.println(dynamicStack.isEmpty());
        dynamicStack.pop();
        dynamicStack.push(1);
        dynamicStack.push(11);

        System.out.println("peek: " + dynamicStack.peek());
        dynamicStack.pop();
        dynamicStack.print();
    }
}

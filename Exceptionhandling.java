class Exception1{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero:" +e.getMessage());
        }
        System.out.println("program continues after handling the exception.");
    }
}

class Exception2{
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Cannot call method on a null object:" +e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }
}

class Exception3{
    public static void main(String[] args){
        int[] arr = new int[5];
        try{
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds:" +e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }
}

class Exception4{
    public static void main(String[] args){
        String str = "10";
                try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException e){
             System.out.println("Cannot convert string to number:" +e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }
}  

class Exception5{
    public static void main(String[] args){
        try{
            int result = 10 / 0;
        }
        catch(ArithmeticException e){
             System.out.println("Caught an arithmetic exception:" +e.getMessage());
        }
        finally {
            System.out.println("This block will always execute.");
        }
        System.out.println("Program continues after handling the exception.");
    }
}

class Exceptionthrow{
    public static void main(String[] args){
        int a = -1;

        if (a < 0) {
            throw new  IllegalArgumentException("Value cannot be negative: "+a);
        }
        System.out.println("Value is:" +a);
    }
}

class Exceptionthrows{
    public static void main(String[] args){
        try{
            methodThatThrowsException();            
        } catch (Exception e){
            System.out.println("Caught an exception:" +e.getMessage());
        }
    }

    public static void methodThatThrowsException() throws Exception{
        throw new Exception("This is a custom exception message.");
    }
}

class myexception extends Exception{
    public myexception(String message){
        super(message);
    }
}

class ExceptionMyException{
     public static void main(String[] args){
        try{
            validateAge(15);
        } catch (myexception e){
             System.out.println("Caught my custom exception:" +e.getMessage());
        }
    }

    public static void validateAge(int age) throws myexception{
        if (age < 18){
             throw new myexception("Age must be at least 18. Provided age:" +age);
        }
        System.out.println("Age is valid:" +age);
    }
}
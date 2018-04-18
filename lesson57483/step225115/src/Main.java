public static void methodCatchingSomeExceptions()  {
    // invoke methodThrowingExceptions here and catch some types of exceptions
     try {methodThrowingExceptions();
     } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
     } catch (NumberFormatException e) {
        System.out.println("NumberFormatExeption");
     } catch (Exception e) {
            throw new Exception();
        }
}
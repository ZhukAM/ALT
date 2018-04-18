public static void methodCatchingExceptions() {
    try {
        methodThrowingExceptions();
    }  catch (CException c) {
        System.out.println("C");
    } catch (AException a) {
        System.out.println("A OR B");
    } catch (DException d ) {
        System.out.println("ROOT OR D");
    }
}
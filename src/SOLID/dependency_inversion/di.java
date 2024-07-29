package SOLID.dependency_inversion;

// Dependency Inversion Principle
// Class should depend on interafces not on concrete classes

//create a keyboard and mouse interafce with a wired and wireless classes for both
interface Keyboard{
    void type();
}
interface Mouse{
    void click();
}

class WiredKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Typing on wired keyboard");
    }
}

class WirelessKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Typing on wireless keyboard");
    }
}

class WiredMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Clicking on wired mouse");
    }
}  

class WirelessMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Clicking on wireless mouse");
    }
}

// a macbook class with a keyboard and mouse object types which are wired keybboard and mouse as a bad example for dependency inversion
class MacBook{
    WiredKeyboard keyboard;
    WiredMouse mouse;

    public MacBook(WiredKeyboard keyboard, WiredMouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void type(){
        keyboard.type();
    }

    public void click(){
        mouse.click();
    }
}
//this macbook class requires concrete classes of wired keyboard and mouse
//this is a bad example of dependency inversion principle
// a better implementation would have interfaces for keyboard and mouse and then the macbook class would depend on the interfaces
// this way, we can easily change the keyboard and mouse classes without changing the macbook class

// a better implementation of macbook class with keyboard and mouse interfaces
class MacBook2{
    Keyboard keyboard;
    Mouse mouse;

    public MacBook2(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void type(){
        keyboard.type();
    }

    public void click(){
        mouse.click();
    }
}
//we can now either pass wired or wireless keyboard and mouse objects to the macbook class
//this is a better implementation of dependency inversion principle



//package editor;
//
//public class TextEditor {
//    private String text;
//    private int cursorPosition;
//
//    public TextEditor() {
//        text = "";
//        cursorPosition = 0;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public int getCursorPosition() {
//        return cursorPosition;
//    }
//
//    public void insert(String text) {
//        this.text = this.text.substring(0, cursorPosition) + text + this.text.substring(cursorPosition);
//        cursorPosition += text.length();
//    }
//
//    public void backspace(int n) {
//        n = Math.min(n, cursorPosition);
//        text = text.substring(0, cursorPosition - n) + text.substring(cursorPosition);
//        cursorPosition -= n;
//    }
//
//    public void moveCursorLeft(int n) {
//        cursorPosition = Math.min(n, cursorPosition);
//    }
//
//    public void moveCursorRight(int n) {
//        cursorPosition = Math.min(n, text.length() - cursorPosition);
//    }
//}

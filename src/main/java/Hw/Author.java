package Hw;
public class Author {
    private String nameOfAuthor;
    private String surnameOfAuthor;
    //конструктор Author с двумя параметрами
    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }
    //геттер для поля nameOfAuthor  поля имя автора
    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }
    //геттер для surnameOfAutho поля фамилия автора
    public String getSurnameOfAuthor() {
        return this.surnameOfAuthor;
    }
    @Override
    public String toString() {
        return ". Автор: " + this.nameOfAuthor + " " + this.surnameOfAuthor;
    }
}

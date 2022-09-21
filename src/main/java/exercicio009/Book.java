package exercicio009;

public class Book implements Publication{
    private String title;
    private String author;
    private int numberOfPages;
    private int currentPage;
    private boolean isOpen;
    private Person reader;

    public void details() {
        System.out.println("Titulo: " + this.title);
        System.out.println("Auto(a): " + this.author);
        System.out.println("Total de paginas: " + this.numberOfPages);
        System.out.println("Pagina atual: " + this.currentPage);
        System.out.println("Está aberto? " + this.isOpen);
        System.out.println("Pessoa lendo atualmente: " + reader.getName());
        System.out.println("Idade: " + reader.getAge());
        System.out.println("Sexo: " + reader.getSex());

    }

    public Book(String title, String author, int numberOfPages, Person reader) {
        this.title = title;
        this.author = author;
        this.isOpen = isOpen;
        this.currentPage = 0;
        this.numberOfPages = numberOfPages;
        this.reader = reader;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public boolean getIsOpen() {
        return isOpen;
    }
    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public void open() {
        this.isOpen = true;
    }

    @Override
    public void close() {
        this.isOpen = false;
    }

    @Override
    public void leafThrough(int pageNumber) {
        if(pageNumber > numberOfPages){
            this.currentPage = 0;
        } else {
            this.currentPage = pageNumber;
        }
    }

    @Override
    public void nextPage() {
        this.currentPage++;
    }

    @Override
    public void previousPage() {
        this.currentPage--;
    }
}

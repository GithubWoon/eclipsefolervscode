public class Book {
    private String title;
    private String author;
    private String description;

    // 생성자 영역
    public Book() {
    }
    public Book(String title, String author, String description) {
    
        this.title = title;
        this.author = author;
        this.description = description;
}

    public String toString() {
        return String.format("Book(title=%s, author=%s, " + "description=%s)", this.title, this.author, this.description);
    }

    // 내부 클래스
    public static class BookBulider {
        // 필드 영역
        private String title;
        private String author;
        private String description;

        // 생성자
        pubilic BookBuilder() {
        }

        public BookBulider builder() {
        }

        // 메소드 영역
        public BookBuilder title(String title) {
            this.tilte = title;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Book2 bulid() {
            return new Book2
        }
        
    }
}
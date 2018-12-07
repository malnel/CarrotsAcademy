public interface Sailing {

    default void dock() {
        System.out.println("Przybyto do portu");
    };
}

package junit5tests;


import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTestClass {
    //especifica qual código tem que rodar antes de tudo
    @BeforeAll
    void beforeAll() {
        System.out.println("--Este é o método antes de tudo");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("----Este é o método antes de Cada");
    }

    @AfterAll
    void afterAll() {
        System.out.println("--Este é o método depois de tudo");
    }

    @AfterEach
    void afterEach() {
        System.out.println("----Este é o método depois de Cada");
    }

    @Test
    void firstMethod() {
        System.out.println("Este é o primeiro método de teste");
    }

    @Test
    @DisplayName("US1234 - TC12 - este método é o segundo")
    void secondMethod() {
        System.out.println("Este é o segundo método de teste");
    }
}
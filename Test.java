import java.util.*;

public class SearchSystemTest {
    public static void main(String[] args) {
        SearchSystem system = new SearchSystem();

        // Данные для тестирования
        system.addPage("Page1", Arrays.asList("apple", "banana", "cherry"), 2);
        system.addPage("Page2", Arrays.asList("dog", "cat"), 3);
        system.addPage("Page3", Collections.emptyList(), 0);

        // Тесты для displayPages()
        System.out.println("=== Test displayPages ===");
        system.displayPages(); // Тест 1: Должны отображаться все страницы с указанием количества их посещений
        system.addPage("Page4", Arrays.asList("elephant", "fish"), 1);
        system.displayPages(); // Тест 2: Должна быть включена недавно добавленная страница

        // Тесты для displayKeywords()
        System.out.println("\n=== Test displayKeywords ===");
        system.displayKeywords("Page1"); // Тест 1: Должны отображаться ключевые слова страницы 1
        system.displayKeywords("PageX"); // Тест 2: Должно быть напечатано "Page not found."

        // Тесты для displayPagesWithoutKeywords()
        System.out.println("\n=== Test displayPagesWithoutKeywords ===");
        system.displayPagesWithoutKeywords(); // Тест 1: Должна отображаться страница 3
        system.addPage("Page5", Collections.emptyList(), 1);
        system.displayPagesWithoutKeywords(); // Тест 2: Должны отображаться страницы 3 и 5

        // Тесты для pagesWithMaxKeywords()
        System.out.println("\n=== Test pagesWithMaxKeywords ===");
        system.pagesWithMaxKeywords(); // Тест 1: Должна отображаться страница 1 максимум с 3 ключевыми словами
        system.addPage("Page6", Arrays.asList("grape", "melon", "kiwi"), 2);
        system.pagesWithMaxKeywords(); // Тест 2: Должны отображаться страницы 1 и 6

        // Тесты для pagesMatchingWordEvenness()
        System.out.println("\n=== Test pagesMatchingWordEvenness ===");
        system.pagesMatchingWordEvenness(); // Тест 1: Должны отображаться страницы, на которых количество слов соответствует равномерности и длине слов
        system.addPage("Page7", Arrays.asList("apple", "carrot"), 0);
        system.pagesMatchingWordEvenness(); // Тест 2: Должен включать страницу 7, если она соответствует условию

        // Тесты для pageWithLongestWord()
        System.out.println("\n=== Test pageWithLongestWord ===");
        system.pageWithLongestWord(); // Тест 1: Должна отображаться страница 4 с надписью "elephant".
        system.addPage("Page8", Arrays.asList("watermelon"), 1);
        system.pageWithLongestWord(); // Тест 2: Должна отображаться страница 8 с надписью "арбуз".

        // Тесты для findMostRelevantPage()
        System.out.println("\n=== Test findMostRelevantPage ===");
        system.findMostRelevantPage(Arrays.asList("banana", "dog")); // Тест 1: Должна отображаться страница 1
        system.findMostRelevantPage(Arrays.asList("grape", "melon")); // Тест 2: Должна отображаться страница 6
      
        // Тесты для topThreePages()
        System.out.println("\n=== Test topThreePages ===");
        system.topThreePages(); // Тест 1: Должны отображаться 3 лучшие страницы в зависимости от количества посещений
        system.addPage("Page9", Arrays.asList("pear"), 10);
        system.topThreePages(); // Тест 2: Следует включить страницу 9 в список самых посещаемых

        // Тесты для findLeastRelevantPages()
        System.out.println("\n=== Test findLeastRelevantPages ===");
        system.findLeastRelevantPages(Arrays.asList("apple", "dog", "fish")); // Тест 1: Должны отображаться страницы с наименьшим количеством совпадений ключевых слов
        system.findLeastRelevantPages(Arrays.asList("pear", "kiwi")); // Тест 2: Должны отображаться страницы без совпадений
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    RequestToDB example = new RequestToDB();

    @Test
    public void test3a()
    {
        String expected = "[[\"Anya\"], [\"Artem\"], [\"Artem\"], [\"Boguslav\"], [\"Gregory\"], [\"Mark\"], [\"Olga\"], [\"Vlad\"]]";
        assertEquals(example.func3a(), expected);
    }

    @Test
    public void test3b()
    {
        String expected = "[[\"Artem\", 23], [\"Artem\", 23], [\"Boguslav\", 20], [\"Mark\", 20], [\"Gregory\", 19], [\"Vlad\", 15]]";
        assertEquals(example.func3b(), expected);
    }

    @Test
    public void test3c()
    {
        String expected = "[[\"Artem\"], [\"Gregory\"]]";
        assertEquals(example.func3c("Boguslav"), expected);
    }

    @Test
    public void test3d()
    {
        String expected = "[[\"Boguslav\"], [\"Boguslav\"], [\"Mark\"], [\"Vlad\"], [\"Vlad\"]]";
        assertEquals(example.func3d("Boguslav"), expected);
    }

    @Test
    public void test3e()
    {
        String expected = "[[\"Anya\", 1], [\"Artem\", 4], [\"Boguslav\", 2], [\"Gregory\", 3], [\"Mark\", 1], [\"Olga\", 1], [\"Vlad\", 2]]";
        assertEquals(example.func3e(), expected);
    }

    @Test
    public void test3f()
    {
        String expected = "[[\"IT KPI\"], [\"KPI live\"]]";
        assertEquals(example.func3f(), expected);
    }

    @Test
    public void test3g()
    {
        String expected = "[[\"IT KPI\"], [\"KPI live\"]]";
        assertEquals(example.func3g("Boguslav"), expected);
    }

    @Test
    public void test3h()
    {
        String expected = "[[\"KPI live\", 7], [\"IT KPI\", 4]]";
        assertEquals(example.func3h(), expected);
    }


    @Test
    public void test3j()
    {
        String expected = "[[5]]";
        assertEquals(example.func3j("Boguslav"), expected);
    }

    @Test
    public void test4a()
    {
        String expected = "[[[\"B Ghost fish driftfish, rock cod \", \"B pike\"]]]";
        assertEquals(example.func4a("Boguslav"), expected);
    }

    @Test
    public void test4b()
    {
        String expected = "[[\"Gregory\", [\"G  Gulper, rockweed gunnel pricklefish \", \"G  Lemon sole atka mackerel Sacramento\"]], [\"Artem\", [\"A Carps streamer fish squeaker-yellow\"]], [\"Boguslav\", []], [\"Anya\", []], [\"Artem\", [\"A kokanee cobbler Sacramento blackfish\"]], [\"Vlad\", [\"V catfish archerfish freshwater hatchetfish \"]], [\"Olga\", [\"O Lemon sole atka mackerel Sacramento \", \"O Cutthroat eel swampfish weatherfish tope\"]], [\"Mark\", [\"M Red salmon prowfish Rasbora gray mullet, denticle herring \"]]]";
        assertEquals(example.func4b(35), expected);
    }

    @Test
    public void test4c()
    {
        String expected = "[[\"Gregory\", 5], [\"Artem\", 5], [\"Vlad\", 5], [\"Anya\", 4], [\"Artem\", 3], [\"Olga\", 3], [\"Boguslav\", 2], [\"Mark\", 2]]";
        assertEquals(example.func4c(), expected);
    }

    @Test
    public void test4d()
    {
        String expected = "[[\"Vlad\", [\"V Ruffe unicorn fish \", \"V blackfish rockweed\", \"V catfish archerfish freshwater hatchetfish \", \"V cobbler \", \"V spaghetti eel pearleye\"]], [\"Boguslav\", [\"B Ghost fish driftfish, rock cod \", \"B pike\"]], [\"Vlad\", [\"V Ruffe unicorn fish \", \"V blackfish rockweed\", \"V catfish archerfish freshwater hatchetfish \", \"V cobbler \", \"V spaghetti eel pearleye\"]], [\"Mark\", [\"M Red salmon prowfish Rasbora gray mullet, denticle herring \", \"M tang ocean perch Pacific\"]], [\"Boguslav\", [\"B Ghost fish driftfish, rock cod \", \"B pike\"]]]";
        assertEquals(example.func4d("Boguslav"), expected);
    }

    @Test
    public void test4i()
    {
        String expected = "[[\"Mark\", 43], [\"Olga\", 35], [\"Anya\", 27], [\"Vlad\", 23], [\"Artem\", 22], [\"Boguslav\", 19], [\"Artem\", 18], [\"Gregory\", 17]]";
        assertEquals(example.func4i(), expected);
    }

}

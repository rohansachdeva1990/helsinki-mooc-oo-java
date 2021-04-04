import java.util.List;

public class Menu {

    private static String NEW_LINE = "\n";
    private String menu;
    private List<MenuOption> options;

    Menu(List<MenuOption> options) {
        this.options = options;
        prepare();
    }

    private void prepare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Choose operation:").append(NEW_LINE);
        for (MenuOption option : options) {
            sb.append(option).append(NEW_LINE);
        }
        sb.append("> ");
        menu = sb.toString();
    }

    @Override
    public String toString() {
        return menu;
    }

    public static class MenuOption {

        private String key;
        private String value;

        public MenuOption(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[").append(key).append("] ").append(value);
            return sb.toString();
        }
    }
}

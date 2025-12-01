public class Main {
    enum Season {
        WINTER("Winter", 1) {
            @Override
            public String getDescription() {
                return "Холодное время года";
            }

            @Override
            public String getActivity() {
                return "Кататься на лыжах";
            }
        },
        SPRING("Spring", 2) {
            @Override
            public String getDescription() {
                return "Время пробуждения природы";
            }

            @Override
            public String getActivity() {
                return "Гулять в парке";
            }
        },
        SUMMER("Summer", 3) {
            @Override
            public String getDescription() {
                return "Жаркое время года";
            }

            @Override
            public String getActivity() {
                return "Отдыхать на море";
            }
        },
        FALL("Fall", 4) {
            @Override
            public String getDescription() {
                return "Прохладное время года";
            }

            @Override
            public String getActivity() {
                return "Учиться и работать";
            }
        };

        private final String name;
        private final int order;

        Season(String name, int order) {
            this.name = name;
            this.order = order;
        }

        public String getName() {
            return name;
        }

        public int getOrder() {
            return order;
        }

        public abstract String getDescription();
        public abstract String getActivity();
    }

    public void printSeasonInfo() {
        for (Season season : Season.values()) {
            System.out.printf("%s (Order: %d) - %s\n", season.getName(), season.getOrder(), season.getDescription());
            System.out.println("Activity: " + season.getActivity());
            System.out.println();  // Пустая строка для разделения
        }
    }

    public static void main(String[] args) {
        Main example = new Main();
        example.printSeasonInfo();
    }
}
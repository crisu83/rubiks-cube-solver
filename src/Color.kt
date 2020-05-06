enum class Color {
    WHITE {
        override fun toString(): String {
            return "W"
        }
    },
    RED {
        override fun toString(): String {
            return "R"
        }
    },
    BLUE {
        override fun toString(): String {
            return "B"
        }
    },
    ORANGE {
        override fun toString(): String {
            return "O"
        }
    },
    GREEN {
        override fun toString(): String {
            return "G"
        }
    },
    YELLOW {
        override fun toString(): String {
            return "Y"
        }
    }
}
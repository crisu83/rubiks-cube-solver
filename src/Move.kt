enum class Move {
    WHITE_CLOCKWISE {
        override fun toString(): String {
            return "W "
        }
    },
    RED_CLOCKWISE {
        override fun toString(): String {
            return "R "
        }
    },
    BLUE_CLOCKWISE {
        override fun toString(): String {
            return "B "
        }
    },
    ORANGE_CLOCKWISE {
        override fun toString(): String {
            return "O "
        }
    },
    GREEN_CLOCKWISE {
        override fun toString(): String {
            return "G "
        }
    },
    YELLOW_CLOCKWISE {
        override fun toString(): String {
            return "Y "
        }
    },
    WHITE_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "W'"
        }
    },
    RED_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "R'"
        }
    },
    BLUE_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "B'"
        }
    },
    ORANGE_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "O'"
        }
    },
    GREEN_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "G'"
        }
    },
    YELLOW_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "Y'"
        }
    }
}
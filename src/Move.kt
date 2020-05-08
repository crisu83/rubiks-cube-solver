enum class Move {
    WHITE_CLOCKWISE {
        override fun toString(): String {
            return "W1"
        }
    },
    RED_CLOCKWISE {
        override fun toString(): String {
            return "R1"
        }
    },
    BLUE_CLOCKWISE {
        override fun toString(): String {
            return "B1"
        }
    },
    ORANGE_CLOCKWISE {
        override fun toString(): String {
            return "O1"
        }
    },
    GREEN_CLOCKWISE {
        override fun toString(): String {
            return "G1"
        }
    },
    YELLOW_CLOCKWISE {
        override fun toString(): String {
            return "Y1"
        }
    },
    WHITE_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "W3"
        }
    },
    RED_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "R3"
        }
    },
    BLUE_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "B3"
        }
    },
    ORANGE_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "O3"
        }
    },
    GREEN_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "G3"
        }
    },
    YELLOW_COUNTER_CLOCKWISE {
        override fun toString(): String {
            return "Y3"
        }
    }
}
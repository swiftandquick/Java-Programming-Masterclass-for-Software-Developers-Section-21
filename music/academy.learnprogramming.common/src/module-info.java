module academy.learnprogramming.common {
    requires javafx.base;

    opens academy.learnprogramming.common to javafx.base;

    /* Export the academy.learnprogramming.common module.  */
    exports academy.learnprogramming.common;
}
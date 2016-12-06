package matching_brackets;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Theories.class)
public class ExpressionValidatorTest {
    @DataPoints("validExpressions")
    public static String[] validExpressions = new String[]{
            "()",
            "()()",
            "(())",
            "(abc(def))",
            "[]",
            "([])",
            "([()])",
            "([][])",
            "()[]"
    };

    @DataPoints("invalidExpressions")
    public static String[] invalidExpressions = new String[]{
            "(",
            ")",
            "(()))",
            "(abc(def)",
            "([)",
            "([())",
            "([[])",
            "([[])(",
            "[",
            "]",
    };

    @Theory
    public void it_marks_valid_expressions_as_valid(@FromDataPoints("validExpressions") String validExpression) {
        ExpressionValidator validator = new ExpressionValidator();

        assertTrue(validator.hasMatchingBrackets(validExpression));
    }

    @Theory
    public void it_marks_invalid_expressions_as_invalid(@FromDataPoints("invalidExpressions") String invalidExpression) {
        ExpressionValidator validator = new ExpressionValidator();

        assertFalse(validator.hasMatchingBrackets(invalidExpression));
    }
}

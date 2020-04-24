package Question;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.List;
import java.lang.Math;

public class Solve {
    public static int solve(String Equation) throws ScriptException {
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return (int) engine.eval(Equation);
    }
}
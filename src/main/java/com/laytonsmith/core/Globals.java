

package com.laytonsmith.core;

import com.laytonsmith.core.constructs.CNull;
import com.laytonsmith.core.constructs.IVariable;
import com.laytonsmith.core.natives.interfaces.Mixed;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides a global registry for values. This is used by the import/export system.
 */
public final class Globals {

    private Globals(){}

    public static Map<String, IVariable> global_ivar = new HashMap<>();
    public static Map<String, Mixed> global_construct = new HashMap<>();

	/**
	 * Sets a variable in the global registry.
	 * @param name The value name
	 * @param value The value itself
	 */
    public static synchronized void SetGlobal(String name, Mixed value){
        Map<String, Mixed> vars = global_construct;//(HashMap<String, Mixed>)env.get("global_construct");
		if(value instanceof CNull){
			vars.remove(name);
		} else {
			vars.put(name, value);
		}
    }

	/**
	 * Returns a value previously stored in the global registry. If the value
	 * hasn't been set before, CNull is returned. Regardless, a valid Mixed
	 * is always returned, never null.
	 * @param name The name of the value to return.
	 * @return
	 */
    public static synchronized Mixed GetGlobalConstruct(String name){
        Map<String, Mixed> vars = global_construct;//(HashMap<String, Mixed>)env.get("global_construct");
        if(vars.containsKey(name)){
            return vars.get(name);
        } else {
            return CNull.NULL;
        }
    }

	/**
	 * Clears out all the values in the registry.
	 */
    public static synchronized void clear(){
        global_ivar.clear();
        global_construct.clear();
    }
}

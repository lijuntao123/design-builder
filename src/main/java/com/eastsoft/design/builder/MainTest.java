package com.eastsoft.design.builder;

import com.eastsoft.design.builder.entity.Director;
import com.eastsoft.design.builder.entity.Whole;
import com.eastsoft.design.builder.entity.WholeABuilder;
import com.eastsoft.design.builder.entity.WholeBBuilder;

/**
 * @author ljt
 * @date 2015-4-11 08:24:57
 */
public class MainTest 
{
    public static void main( String[] args )
    {
        WholeABuilder wholeAb=new WholeABuilder();
        Director director=new Director(wholeAb);
        
        Whole wholeA=director.construct();
        
        WholeBBuilder wholeBb=new WholeBBuilder();
        director=new Director(wholeBb);
        Whole wholeB=director.construct();
    }
}

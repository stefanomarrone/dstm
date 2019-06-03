/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.parameter.node;

import org.prgmdl.dstmverifier.transition.parameter.analysis.*;

@SuppressWarnings("nls")
public final class TSemi extends Token
{
    public TSemi()
    {
        super.setText(";");
    }

    public TSemi(int line, int pos)
    {
        super.setText(";");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSemi(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSemi(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSemi text.");
    }
}

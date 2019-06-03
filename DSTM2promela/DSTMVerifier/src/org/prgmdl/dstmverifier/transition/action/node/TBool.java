/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.action.node;

import org.prgmdl.dstmverifier.transition.action.analysis.*;

@SuppressWarnings("nls")
public final class TBool extends Token
{
    public TBool()
    {
        super.setText("Bool");
    }

    public TBool(int line, int pos)
    {
        super.setText("Bool");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBool(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBool(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBool text.");
    }
}

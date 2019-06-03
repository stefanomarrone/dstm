/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.condition.node;

import org.prgmdl.dstmverifier.transition.condition.analysis.*;

@SuppressWarnings("nls")
public final class TColonColon extends Token
{
    public TColonColon()
    {
        super.setText("::");
    }

    public TColonColon(int line, int pos)
    {
        super.setText("::");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TColonColon(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTColonColon(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TColonColon text.");
    }
}

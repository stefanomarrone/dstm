/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.trigger.node;

import org.prgmdl.dstmverifier.transition.trigger.analysis.*;

@SuppressWarnings("nls")
public final class TBarBar extends Token
{
    public TBarBar()
    {
        super.setText("||");
    }

    public TBarBar(int line, int pos)
    {
        super.setText("||");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBarBar(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBarBar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBarBar text.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.parameter.node;

import org.prgmdl.dstmverifier.transition.parameter.analysis.*;

@SuppressWarnings("nls")
public final class TLenbis extends Token
{
    public TLenbis()
    {
        super.setText("len(");
    }

    public TLenbis(int line, int pos)
    {
        super.setText("len(");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLenbis(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLenbis(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLenbis text.");
    }
}

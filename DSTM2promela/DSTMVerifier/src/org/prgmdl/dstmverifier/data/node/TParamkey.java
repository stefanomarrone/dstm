/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.node;

import org.prgmdl.dstmverifier.data.analysis.*;

@SuppressWarnings("nls")
public final class TParamkey extends Token
{
    public TParamkey()
    {
        super.setText("Param");
    }

    public TParamkey(int line, int pos)
    {
        super.setText("Param");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TParamkey(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParamkey(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TParamkey text.");
    }
}

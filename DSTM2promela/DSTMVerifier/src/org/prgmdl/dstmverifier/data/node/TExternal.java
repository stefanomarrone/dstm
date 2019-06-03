/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.node;

import org.prgmdl.dstmverifier.data.analysis.*;

@SuppressWarnings("nls")
public final class TExternal extends Token
{
    public TExternal()
    {
        super.setText("external");
    }

    public TExternal(int line, int pos)
    {
        super.setText("external");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TExternal(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTExternal(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TExternal text.");
    }
}

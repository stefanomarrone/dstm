/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.action.node;

import org.prgmdl.dstmverifier.transition.action.analysis.*;

@SuppressWarnings("nls")
public final class TFull extends Token
{
    public TFull()
    {
        super.setText("full");
    }

    public TFull(int line, int pos)
    {
        super.setText("full");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFull(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFull(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFull text.");
    }
}

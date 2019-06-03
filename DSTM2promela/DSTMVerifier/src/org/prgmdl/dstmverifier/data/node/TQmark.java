/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.node;

import org.prgmdl.dstmverifier.data.analysis.*;

@SuppressWarnings("nls")
public final class TQmark extends Token
{
    public TQmark()
    {
        super.setText("?");
    }

    public TQmark(int line, int pos)
    {
        super.setText("?");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TQmark(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTQmark(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TQmark text.");
    }
}

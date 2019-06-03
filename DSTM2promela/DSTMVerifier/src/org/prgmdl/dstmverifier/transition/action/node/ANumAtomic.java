/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.action.node;

import org.prgmdl.dstmverifier.transition.action.analysis.*;

@SuppressWarnings("nls")
public final class ANumAtomic extends PAtomic
{
    private TNumbers _numbers_;

    public ANumAtomic()
    {
        // Constructor
    }

    public ANumAtomic(
        @SuppressWarnings("hiding") TNumbers _numbers_)
    {
        // Constructor
        setNumbers(_numbers_);

    }

    @Override
    public Object clone()
    {
        return new ANumAtomic(
            cloneNode(this._numbers_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumAtomic(this);
    }

    public TNumbers getNumbers()
    {
        return this._numbers_;
    }

    public void setNumbers(TNumbers node)
    {
        if(this._numbers_ != null)
        {
            this._numbers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numbers_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numbers_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numbers_ == child)
        {
            this._numbers_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numbers_ == oldChild)
        {
            setNumbers((TNumbers) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

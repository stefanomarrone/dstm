/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.condition.node;

import org.prgmdl.dstmverifier.transition.condition.analysis.*;

@SuppressWarnings("nls")
public final class ATrueAtomic extends PAtomic
{
    private TTrue _true_;

    public ATrueAtomic()
    {
        // Constructor
    }

    public ATrueAtomic(
        @SuppressWarnings("hiding") TTrue _true_)
    {
        // Constructor
        setTrue(_true_);

    }

    @Override
    public Object clone()
    {
        return new ATrueAtomic(
            cloneNode(this._true_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATrueAtomic(this);
    }

    public TTrue getTrue()
    {
        return this._true_;
    }

    public void setTrue(TTrue node)
    {
        if(this._true_ != null)
        {
            this._true_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._true_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._true_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._true_ == child)
        {
            this._true_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._true_ == oldChild)
        {
            setTrue((TTrue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
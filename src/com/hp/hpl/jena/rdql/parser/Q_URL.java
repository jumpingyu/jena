/*
 * (c) Copyright 2001-2003, Hewlett-Packard Company, all rights reserved.
 * [See end of file]
 */

/* Generated By:JJTree: Do not edit this line. Q_URL.java */

package com.hp.hpl.jena.rdql.parser;
import com.hp.hpl.jena.rdql.QueryException;

public class Q_URL extends ParsedLiteral {

    String urlString ;

    Q_URL(int id) { super(id); }

    Q_URL(RDQLParser p, int id) { super(p, id); }

    void set(String s)
    {
        urlString = s ;
        super.setURI(s);
    }

    public void jjtClose()
    {
        int n = jjtGetNumChildren() ;
        if ( n != 1 )
            throw new QueryException("Q_URL: Wrong number of children: "+n) ;
        Q_URI uri = (Q_URI)jjtGetChild(0) ;
        set(uri.getString()) ;
    }

    public String toString()
    {
    return "url:"+urlString ;
    }
}

/*
 *  (c) Copyright Hewlett-Packard Company 2001-2003
 *  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * This product includes software developed by the
 * Apache Software Foundation (http://www.apache.org/).
 *
 */

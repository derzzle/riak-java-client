package com.basho.riak.client.api.commands.mapreduce;

import com.basho.riak.client.core.query.Namespace;
import com.basho.riak.client.api.commands.mapreduce.filters.KeyFilter;

import java.util.Collection;

public class BucketInput implements MapReduceInput
{

	private final Namespace namespace;
	private final Collection<KeyFilter> filters;

	public BucketInput(Namespace namespace, Collection<KeyFilter> filters)
	{
		this.namespace = namespace;
		this.filters = filters;
	}

	public Namespace getNamespace()
	{
		return namespace;
	}

    public boolean hasFilters()
    {
        return filters != null && !filters.isEmpty();
    }
    
	public Collection<KeyFilter> getFilters()
	{
		return filters;
	}

}
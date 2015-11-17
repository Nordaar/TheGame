package pl.edu.agh.two.domain.players;

import pl.edu.agh.two.domain.attributes.Attribute;
import pl.edu.agh.two.domain.items.AbstractAttributeItem;
import pl.edu.agh.two.domain.players.statistics.IPlayerStatistic;

import java.util.Set;

public interface IPlayer<T extends Number> {

    public String getName();

    public Backpack getBackpack();

    public void useItem(AbstractAttributeItem item);

    public Set<IPlayerStatistic> getStatistics();

    public <T extends Number> IPlayerStatistic<T> getStatistic(Attribute<T> attribute);

}

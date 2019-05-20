import lab6.*;

import java.util.*;

public class CustomSet implements Set<MusicTrack>{

    private static final int START_CAPACITY = 15;
    private static final int MIN_TRACK_TIME_LENGTH = 10;
    private int capacity = (int)(START_CAPACITY*1.3);
    private int currentCapacity;
    private boolean isExtended = false;
    private MusicTrack[] elements = new MusicTrack[START_CAPACITY];
    private int size = 0;

    public CustomSet() {
    }

    private HashSet set1;

    public CustomSet(MusicTrack musicTrack) {
        add(musicTrack);
    }

    public CustomSet(Collection<MusicTrack> collection) {
        addAll(collection);
    }

    public void extend(){
        MusicTrack[] buff = elements;
        elements = new MusicTrack[capacity];
        for(int i = 0; i < buff.length; i++) elements[i] = buff[i];
        currentCapacity = capacity;
        capacity = (int)(currentCapacity*1.3);
        isExtended = true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof MusicTrack){
            for (MusicTrack musT : elements) {
                if (musT != null && musT.equals((MusicTrack)o)) return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<MusicTrack> iterator() {
        return new Iterator<MusicTrack>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public MusicTrack next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    //TODO override this method
    @Override
    public <T> T[] toArray(T[] ts) {
        if (ts.length < size)
            // Make a new array of a's runtime type, but my contents:
            return (T[]) Arrays.copyOf(elements, size, ts.getClass());
        System.arraycopy(elements, 0, ts, 0, size);
        if (ts.length > size)
            ts[size] = null;
        return ts;
    }

    @Override
    public boolean add(MusicTrack musicTrack) {
        if (musicTrack.getLength() < MIN_TRACK_TIME_LENGTH) {
            System.out.println("Length of track cannot be less than " + MIN_TRACK_TIME_LENGTH + ".");
            return false;
        }
        if (this.contains(musicTrack)) return false;
        if (size >= currentCapacity) this.extend();
        elements[size++] = musicTrack;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o instanceof Integer ){
            elements[(int)o] = null;
            return true;
        } else if (o instanceof MusicTrack){
            for (int i = 0; i < elements.length; i++) {
                if (elements[i].equals(o)) elements[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        boolean hasAll = true;
        label1 : for (MusicTrack elem : elements) {
            for(Object mt : collection){
                if (elem.equals(mt)) continue label1;
                hasAll = false;
            }
        }
        return hasAll;
    }

    @Override
    public boolean addAll(Collection<? extends MusicTrack> collection) {
        int i = size;
        boolean ok = false;
        for(Iterator it = collection.iterator(); it.hasNext();){
            MusicTrack elem = (MusicTrack)it.next();
            if (this.contains(elem)) continue;
            if (i >= currentCapacity){
                this.extend();
            }
            elements[i++] = (MusicTrack)it.next();
            if (!ok) ok =true;
        }
        return ok;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        int i = size;
        for(Iterator it = collection.iterator(); it.hasNext();){
            Object mt = it.next();
            if (mt instanceof MusicTrack && !(elements[i].equals(mt))) elements[i++] = null;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        int i = size;
        for(Iterator it = collection.iterator(); it.hasNext();){
            Object mt = it.next();
            if (mt instanceof MusicTrack && elements[i].equals(mt)) elements[i++] = null;
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

}

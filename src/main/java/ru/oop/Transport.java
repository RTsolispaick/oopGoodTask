package ru.oop;

public interface Transport extends Positioned {
    /**
     * Добраться как можно ближе до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void go(Position destination);
}

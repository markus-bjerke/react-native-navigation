import { EventSubscription } from '../adapters/NativeEventsReceiver';

export class EventsRegistry {
  private nativeEventsReceiver;

  constructor(nativeEventsReceiver) {
    this.nativeEventsReceiver = nativeEventsReceiver;
  }

  public appLaunched(callback): EventSubscription {
    return this.nativeEventsReceiver.registerAppLaunched(callback);
  }
}
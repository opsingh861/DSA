class request:
    def __init__(self, arrival_time, process_time):
        self.arrival_time = arrival_time
        self.process_time = process_time


class response:
    def __init__(self, dropped, start_time):
        self.dropped = dropped
        self.start_time = start_time


class buffer:
    def __init__(self, size):
        self.size = size
        self.finish_time_ = []

    def Process(self, request):
        if not self.finish_time_:
            self.finish_time_.append(
                request.arrival_time + request.process_time)
            return response(False, request.arrival_time)

        while self.finish_time_ and self.finish_time_[
                0] <= request.arrival_time:
            self.finish_time_.pop(0)

        if len(self.finish_time_) == self.size:
            return response(True, -1)

        if not self.finish_time_:
            self.finish_time_.append(
                request.arrival_time + request.process_time)
            return response(False, request.arrival_time)

        self.finish_time_.append(self.finish_time_[-1] + request.process_time)
        return response(False, self.finish_time_[-2])


def ReadRequests(count):
    requests = []
    for i in range(count):
        arrival_time, process_time = map(int, input().strip().split())
        requests.append(request(arrival_time, process_time))
    return requests


def ProcessRequests(requests, buffer):
    responses = []
    for request in requests:
        responses.append(buffer.Process(request))
    return responses


def PrintResponses(responses):
    for response in responses:
        print(response.start_time if not response.dropped else -1)


if __name__ == "__main__":
    size, count = map(int, input().strip().split())
    requests = ReadRequests(count)
    buffer = buffer(size)
    responses = ProcessRequests(requests, buffer)
    PrintResponses(responses)